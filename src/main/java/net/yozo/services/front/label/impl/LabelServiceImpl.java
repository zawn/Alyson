package net.yozo.services.front.label.impl;import net.yozo.core.ServersManager;import net.yozo.services.front.label.LabelService;import net.yozo.services.front.label.bean.Label;import net.yozo.services.front.label.dao.LabelDao;import org.apache.commons.lang.StringUtils;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.stereotype.Service;import javax.annotation.Resource;import java.util.ArrayList;import java.util.LinkedList;import java.util.List;@Service("LabelServiceManage")public class LabelServiceImpl extends ServersManager<Label, LabelDao> implements		LabelService {	private static final Logger logger = LoggerFactory.getLogger(LabelServiceImpl.class);    @Override    @Resource(name = "labelDaoManage")    public void setDao(LabelDao LabelDao) {        this.dao = LabelDao;    }	/**	 * 插入父属性和批量的子属性集合	 */	public int insert(Label e) {		if(StringUtils.isBlank(e.getLabelNames0())){			throw new NullPointerException("主属性不能为空！添加失败！");		}				int id = 0;//父属性/参数ID		if(StringUtils.isNotBlank(e.getId())){			id = Integer.valueOf(e.getId());			//更新主属性			dao.update(e);		}else{			//插入父属性			id = dao.insert(e);		}				logger.error("LabelServiceImpl.insert.id"+id);		if(id==0){			throw new RuntimeException("id is error:"+id);		}				if(StringUtils.isBlank(e.getIdList0())){			//插入主属性			Label attr0 = new Label();			attr0.setName(e.getLabelNames0());			attr0.setOrder1(e.getOrder1List0());			attr0.setPid(id);			dao.insert(attr0);		}else{			//修改主属性			Label attr0 = new Label();			attr0.setName(e.getLabelNames0());			attr0.setOrder1(e.getOrder1List0());			//attr0.setPid(id);			attr0.setId(e.getIdList0());			dao.update(attr0);		}		/**		 *  前面页面传送过来的id，编辑页面时才有		 */		List<Integer> frontIdList = new ArrayList<Integer>();		List<Integer> childrenIdList;		if(null != e.getIdList()) {			for (int i = 0; i < e.getIdList().length; i++) {				frontIdList.add(Integer.parseInt(e.getIdList()[i]));			}		}		/**		 * //组装子属性对象集合并插入		 */		if(e.getLabelNames()!=null && e.getIdList()!=null){			List<Label> updatelist = new LinkedList<Label>();			childrenIdList = dao.getChildrenIdsByPid(id);			logger.error("childrenIdList = "+childrenIdList.toString());			childrenIdList.removeAll(frontIdList);			for(int i=0;i<childrenIdList.size();i++){				if(Integer.parseInt(e.getIdList0()) != childrenIdList.get(i)) {					//删除掉前端页面删除掉的 子属性项					dao.deleteById(childrenIdList.get(i));				}			}			if(e.getLabelNames().length==(e.getIdList().length)){				logger.error(">>最佳情况，只是编辑 无删除和新增情况");				//数量相等				for(int i=0;i<e.getIdList().length;i++){					Label label = new Label();					label.setName(e.getLabelNames()[i]);					label.setOrder1(e.getOrder1List()[i]);					label.setPid(id);					label.setId(e.getIdList()[i]);					updatelist.add(label);				}				if(updatelist.size()>0){					for(int i=0;i<updatelist.size();i++){						dao.update(updatelist.get(i));					}				}			}else{				logger.error(">>最差情况  存在删除和新增情况");				//数量不相等				//update				for(int i=0;i<e.getIdList().length;i++){					Label attr = new Label();					attr.setName(e.getLabelNames()[i]);					attr.setOrder1(e.getOrder1List()[i]);					attr.setId(e.getIdList()[i]);					updatelist.add(attr);				}								List<Label> insertList = new LinkedList<Label>();				//insert				for(int i=e.getIdList().length;i<e.getLabelNames().length;i++){					if(StringUtils.isBlank(e.getLabelNames()[i])){						continue;					}					Label label = new Label();					label.setName(e.getLabelNames()[i]);					label.setOrder1(e.getOrder1List()[i]);					label.setPid(id);										insertList.add(label);				}								logger.error(">>数量不相等updatelist="+updatelist.size()+",insertList="+insertList.size());				if(updatelist.size()>0){					for(int i=0;i<updatelist.size();i++){						dao.update(updatelist.get(i));					}				}				if(insertList.size()>0){					for(int i=0;i<insertList.size();i++){						dao.insert(insertList.get(i));					}				}			}		}else if(e.getLabelNames()!=null && e.getIdList()==null){			//  新增子属性			//组装子属性对象集合并插入			for(int i=0;i<e.getLabelNames().length;i++){				if(StringUtils.isNotBlank(e.getLabelNames()[i])){					Label label = new Label();					label.setName(e.getLabelNames()[i]);					label.setPid(id);					label.setOrder1(e.getOrder1List()[i]);					dao.insert(label);				}			}		}		logger.error("LabelServiceImpl.insert.id,return."+id);		return id;	}		/**	 * 删除商品属性数据，需要同时删除该属性下的子属性 以及 Label_link表的关联数据	 *///	public int delete(Label e) {//		super.delete(e);//		dao.deleteByPid(e);//		return 1;//	}	/**	 * 需哟重写父类的此方法	 * 批量删除	 * 	 * 删除商品属性数据，需要同时删除该属性下的子属性 以及 Label_link表的关联数据	 * 	 * 无论你删除的是商品属性还是商品参数，此方法都会根据选择的ID集合区删除所有的数据，主要包括：主属性表的数据、该主属性下的所有子属性、属性关联表的数据	 * .并且是事物控制的删除。	 * @param ids	 * @return	 */	public int deletes(String[] ids) {		if (ids != null && ids.length > 0) {			for (int i = 0; i < ids.length; i++) {				logger.error("deleteAllById.id="+ids[i]);				if(StringUtils.isBlank(ids[i])){					throw new NullPointerException();				}				int id = Integer.parseInt(ids[i]);								//删除Label_link表的相关联的数据				//label_linkDao.deleteByLabelId(id);								//根据PID删除选择属性下 的所有子属性				dao.deleteByPid(id);								//根据ID删除选择的属性				dao.deleteById(id);								//由于mybatis不支持同一个statment下执行多个SQL语句，所以只能写多个方法先解决，以后发现有好的方法了再改进。//				dao.deleteAllById(id);			}		}		return 0;	}	@Override	public int selectCount(Label ee) {		return dao.selectCount(ee);	}}
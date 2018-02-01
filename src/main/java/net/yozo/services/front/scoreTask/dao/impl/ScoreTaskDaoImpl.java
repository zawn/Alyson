package net.yozo.services.front.scoreTask.dao.impl;import net.yozo.core.dao.BaseDao;import net.yozo.core.dao.page.PagerModel;import net.yozo.services.front.scoreTask.bean.ScoreTask;import net.yozo.services.front.scoreTask.dao.ScoreTaskDao;import org.springframework.stereotype.Repository;import javax.annotation.Resource;import java.util.List;@Repository("scoreTaskDaoFront")public class ScoreTaskDaoImpl implements ScoreTaskDao {	@Resource	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(ScoreTask e) {		return dao.selectPageList("front.scoreTask.selectPageList",				"front.scoreTask.selectPageCount", e);	}	public List selectList(ScoreTask e) {		return dao.selectList("front.scoreTask.selectList", e);	}	public ScoreTask selectOne(ScoreTask e) {		return (ScoreTask) dao.selectOne("front.scoreTask.selectOne", e);	}	public int delete(ScoreTask e) {		return dao.delete("front.scoreTask.delete", e);	}	public int update(ScoreTask e) {		return dao.update("front.scoreTask.update", e);	}	public int deletes(String[] ids) {		ScoreTask e = new ScoreTask();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(ScoreTask e) {		return dao.insert("front.scoreTask.insert", e);	}	public int deleteById(int id) {		return dao.delete("front.scoreTask.deleteById", id);	}	@Override	public ScoreTask selectById(String id) {		return (ScoreTask) dao.selectOne("front.scoreTask.selectOne", id);	}	@Override	public ScoreTask getScoreTaskByFlag(String flag) {		return (ScoreTask) dao.selectOne("front.scoreTask.getScoreTaskByFlag", flag);	}}
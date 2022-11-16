package service;

import mapper.PoemMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.Poem;
import pojo.PoemExample;
import utils.MybatisUtils;

import java.util.List;


public class PoemService {

    public List<Poem> selectPoem(String poet, String year, String type) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        PoemMapper poemMapper= sqlSession.getMapper(PoemMapper.class);
        PoemExample poemExample = new PoemExample();
        PoemExample.Criteria criteria = poemExample.createCriteria();
        if (poet!=null) {
            poet="%" + poet + "%";
            criteria.andPoetLike(poet);
        }
        if (year!=null){
            criteria.andYearEqualTo(year);
        }
        if (type!=null){
            criteria.andTypeEqualTo(type);
        }
        List<Poem> list = poemMapper.selectByExample(poemExample);
        sqlSession.commit();
        return list;
    }

    public List<Poem> selectPoet(String poet) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        PoemMapper poemMapper= sqlSession.getMapper(PoemMapper.class);
        PoemExample poemExample = new PoemExample();
        PoemExample.Criteria criteria = poemExample.createCriteria();
        if (poet!=null) {
            poet="%" + poet + "%";
            criteria.andPoetLike(poet);
        }
        List<Poem> list = poemMapper.selectByExample(poemExample);
        sqlSession.commit();
        return list;
    }
}

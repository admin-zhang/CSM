package xyz.codedog.dao;

import xyz.codedog.po.BaseDict;

import java.util.List;

/**
 * @ClassName BaseDictDao
 * @Description TODO
 * @Author panda
 * @Date 2020/5/16
 * @Version 1.0
 **/
public interface BaseDictDao {
    //  根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}

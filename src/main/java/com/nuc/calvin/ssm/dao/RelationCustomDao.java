package com.nuc.calvin.ssm.dao;

import com.nuc.calvin.ssm.entity.Relation;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface RelationCustomDao {
    /**
     * 查询相互关注
     *
     * @param relation
     * @return
     */
    List<Relation> queryMutual(Relation relation);

    /**
     * 查询单方关注
     *
     * @param relation
     * @return
     */
    List<Relation> queryUnilateral(Relation relation);

    /**
     * 关注
     *
     * @param relation
     */
    void follow(Relation relation);

    /**
     * 取关
     *
     * @param relation
     */
    void unFollow(Relation relation);

    /**
     * 改变关注状态
     * @param relation
     */
    void Status(Relation relation);
}

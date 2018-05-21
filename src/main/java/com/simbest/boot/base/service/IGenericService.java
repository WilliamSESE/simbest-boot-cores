package com.simbest.boot.base.service;

import com.simbest.boot.base.model.GenericModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

/**
/**
 * <strong>Title : 基础实体通用服务层</strong><br>
 * <strong>Description : 基础实体通用服务层</strong><br>
 * <strong>Create on : 2018-05-16</strong><br>
 * <strong>Modify on : 2018-05-16</strong><br>
 * <strong>Copyright (C) Ltd.</strong><br>
 *
 * @author LJW lijianwu@simbest.com.cn
 * @version <strong>V1.0.0</strong><br>
 *          <strong>修改历史:</strong><br>
 *          修改人 修改日期 修改描述<br>
 *          -------------------------------------------<br>
 */
public interface IGenericService <T extends GenericModel,PK extends Serializable>{

    T getById ( PK id );

    /**
     * getOne取出的是实体的引用
     * @param id
     * @return a reference to the entity with the given identifier.
     */
    T getOne ( PK id );

    /**
     * 根据id判断实体是否存在
     * @param id
     * @return
     */
    boolean exists(PK id);

    T save( T o );

    /**
     * 强制执行持久化
     * @param o
     * @return
     */
    T saveAndFlush(T o);

    /**
     * 保存集合(save 待区分)
     * @param iterable
     * @param <S>
     * @return
     */
    <S extends T> List<S> saveAll( Iterable<? extends T> iterable);

    /**
     * 分页查询（含排序功能）
     * @param conditions
     * @param pageable
     * @return
     */
    Page<T>  findAll ( Specification<T> conditions, Pageable pageable);

    /**
     * 分页查询（含排序功能）
     * @param pageable
     * @return
     */
    Page<T> findAll ( Pageable pageable );

    long count();

    long count(Specification<T> specification);

    /**
     * 根据主键删除数据
     * @param id
     */
    void deleteById(PK id);

    /**
     * 根据传入的实体对象属性删除数据
     * @param o
     */
    void delete(T o);

    /**
     * 根据传入的实体对象属性批量删除
     * @param iterable
     */
    void deleteAll(Iterable<? extends T> iterable);

    /**
     * 批量删除（相当于清空数据）
     */
    void deleteAll();

    /**
     * 删除一个实体集合
     * @param entities
     */
    void deleteInBatch(Iterable<T> entities);
}

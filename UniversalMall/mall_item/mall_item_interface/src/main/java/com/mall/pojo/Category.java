package com.mall.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_category")
/**
 * @author li
 * @time 2018/8/7
 * @feature: 商品分类对应的实体
 */
@Data
public class Category{
	@Id
	@KeySql(useGeneratedKeys= true)
	private Long id;
	private String name;
	private Long parentId;
	private Boolean isParent;
	/**
	 * 排序指数，越小越靠前
	 */
	private Integer sort;
	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", name='" + name + '\'' +
				", parentId=" + parentId +
				", isParent=" + isParent +
				", sort=" + sort +
				'}';
	}
}
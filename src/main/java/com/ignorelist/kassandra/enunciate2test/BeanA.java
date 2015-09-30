/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ignorelist.kassandra.enunciate2test;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author poison
 */
@XmlRootElement
public class BeanA implements EntityInterface<Integer> {

	private Integer id;
	private BeanB b;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@XmlJavaTypeAdapter(BeanBAdapter.class)
	public BeanB getB() {
		return b;
	}

	public void setB(BeanB b) {
		this.b = b;
	}
	
	@XmlJavaTypeAdapter(EntityClassAdapter.class)
	public Class<?> entityClass() {
		return BeanA.class;
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ignorelist.kassandra.enunciate2test;

/**
 *
 * @author poison
 */
public class BeanBAdapter extends AbstractEntityAdapter<Integer, BeanB> {

	@Override
	public BeanB withId(Integer primaryKey) {
		return new BeanB(primaryKey);
	}

	

}

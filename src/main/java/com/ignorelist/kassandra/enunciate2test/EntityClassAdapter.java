/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ignorelist.kassandra.enunciate2test;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author poison
 */
public class EntityClassAdapter extends XmlAdapter<String, Class<?>> {

	@Override
	public Class<?> unmarshal(String v) throws Exception {
		final String className = new StringBuilder(EntityInterface.class.getPackage().getName()).append('.').append(v).toString();
		return Class.forName(className);
	}

	@Override
	public String marshal(Class<?> v) throws Exception {
		return v.getSimpleName();
	}

	
	
}

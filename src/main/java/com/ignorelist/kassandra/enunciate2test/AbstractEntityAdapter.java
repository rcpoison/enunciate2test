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
public abstract class AbstractEntityAdapter<K, T extends EntityInterface<K>> extends XmlAdapter<K, T> {

	public abstract T withId(K primaryKey);

	@Override
	public T unmarshal(K v) throws Exception {
		return withId(v);
	}

	@Override
	public K marshal(T v) throws Exception {
		return v.getId();
	}

}

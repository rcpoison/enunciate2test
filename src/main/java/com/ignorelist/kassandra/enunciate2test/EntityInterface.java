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
public interface EntityInterface<K> extends Identifiable<K> {

	void setId(K id);
}

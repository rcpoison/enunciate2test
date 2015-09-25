/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ignorelist.kassandra.enunciate2test;

import javax.ejb.Stateless;
import javax.ws.rs.Path;

/**
 *
 * @author poison
 */
@Stateless
@Path("/")
public class BeanAFacadeREST extends AbstractFacadeREST<Integer, BeanA> {

}

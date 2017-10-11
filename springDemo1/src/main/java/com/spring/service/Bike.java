/**
 * 
 */
package com.spring.service;

/**
 * @ClassName: Bike
 *
 * @Description: 交通工具实现类，单车
 *
 * @author: 芸江
 *
 * @date 2017年9月19日 下午6:37:55
 */
public class Bike implements Vehicle{

	
	@Override
	public void go() {
		System.out.println("骑单车去上班");
	}

}

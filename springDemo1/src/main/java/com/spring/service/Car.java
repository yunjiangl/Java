/**
 * 
 */
package com.spring.service;

/**
 * @ClassName: Car
 *
 * @Description: 交通工具实现类，汽车
 *
 * 
 * @author: 芸江
 *
 * @date 2017年9月19日 下午6:35:45
 */
public class Car implements Vehicle{

	@Override
	public void go() {
		System.out.println("开车去上班。。。");
		
	}
}

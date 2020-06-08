/**
 * 
 */
package cn.qdas.core.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author leo.Zhou 周钧
 * 2019年11月6日
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware{
	private static ApplicationContext context;
	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context=applicationContext;
		
	}
	public static ApplicationContext getApplicationContext() {
	    return context;
	}

	public static Object getBean(String name) {
	    return getApplicationContext().getBean(name);
	}
}

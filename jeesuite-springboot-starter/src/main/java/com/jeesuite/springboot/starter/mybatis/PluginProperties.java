/**
 * 
 */
package com.jeesuite.springboot.starter.mybatis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description <br>
 * @author <a href="mailto:vakinge@gmail.com">vakin</a>
 * @date 2016年12月31日
 */
@ConfigurationProperties(prefix="jeesuite.mybatis")
public class PluginProperties {

	private String dbType = "MySQL";
	private String crudDriver = "mapper3";
	private boolean cacheEnabled = false;
	private boolean rwRouteEnabled = false;
	private boolean dbShardEnabled = false;
	private boolean paginationEnabled = true;
	

	public boolean isCacheEnabled() {
		return cacheEnabled;
	}
	public void setCacheEnabled(boolean cacheEnabled) {
		this.cacheEnabled = cacheEnabled;
	}
	public boolean isRwRouteEnabled() {
		return rwRouteEnabled;
	}
	public void setRwRouteEnabled(boolean rwRouteEnabled) {
		this.rwRouteEnabled = rwRouteEnabled;
	}
	public boolean isDbShardEnabled() {
		return dbShardEnabled;
	}
	public void setDbShardEnabled(boolean dbShardEnabled) {
		this.dbShardEnabled = dbShardEnabled;
	}
	
	public boolean isPaginationEnabled() {
		return paginationEnabled;
	}
	public void setPaginationEnabled(boolean paginationEnabled) {
		this.paginationEnabled = paginationEnabled;
	}
	public String getDbType() {
		return dbType;
	}
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}
	public String getCrudDriver() {
		return crudDriver;
	}
	public void setCrudDriver(String crudDriver) {
		this.crudDriver = crudDriver;
	}

	

}

package com.lomza.logansquare.model2;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Thumbnail{


	@JsonField(name ="default")
	private String jsonMemberDefault;

	@JsonField(name ="hqDefault")
	private String hqDefault;

	public void setJsonMemberDefault(String jsonMemberDefault){
		this.jsonMemberDefault = jsonMemberDefault;
	}

	public String getJsonMemberDefault(){
		return jsonMemberDefault;
	}

	public void setHqDefault(String hqDefault){
		this.hqDefault = hqDefault;
	}

	public String getHqDefault(){
		return hqDefault;
	}

	@Override
 	public String toString(){
		return 
			"Thumbnail{" + 
			"default = '" + jsonMemberDefault + '\'' + 
			",hqDefault = '" + hqDefault + '\'' + 
			"}";
		}
}
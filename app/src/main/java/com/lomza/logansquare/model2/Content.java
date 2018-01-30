package com.lomza.logansquare.model2;


import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;


@JsonObject
public class Content{

	@JsonField(name ="1")
	private String jsonMember1;

	@JsonField(name ="2")
	private String jsonMember2;

	@JsonField(name ="4")
	private String jsonMember4;

	public void setJsonMember1(String jsonMember1){
		this.jsonMember1 = jsonMember1;
	}

	public String getJsonMember1(){
		return jsonMember1;
	}

	public void setJsonMember2(String jsonMember2){
		this.jsonMember2 = jsonMember2;
	}

	public String getJsonMember2(){
		return jsonMember2;
	}

	public void setJsonMember4(String jsonMember4){
		this.jsonMember4 = jsonMember4;
	}

	public String getJsonMember4(){
		return jsonMember4;
	}

	@Override
 	public String toString(){
		return 
			"Content{" + 
			"1 = '" + jsonMember1 + '\'' + 
			",2 = '" + jsonMember2 + '\'' + 
			",4 = '" + jsonMember4 + '\'' + 
			"}";
		}
}
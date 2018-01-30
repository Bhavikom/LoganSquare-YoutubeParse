package com.lomza.logansquare.model2;

import java.util.List;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class Response{


	@JsonField(name ="thumbnail")
	private Thumbnail thumbnail;


	@JsonField(name ="rating")
	private double rating;


	@JsonField(name ="description")
	private String description;


	@JsonField(name ="title")
	private String title;


	@JsonField(name ="content")
	private Content content;


	@JsonField(name ="tags")
	private List<String> tags;


	@JsonField(name ="commentCount")
	private int commentCount;


	@JsonField(name ="duration")
	private int duration;


	@JsonField(name ="uploaded")
	private String uploaded;


	@JsonField(name ="id")
	private String id;


	@JsonField(name ="viewCount")
	private int viewCount;


	@JsonField(name ="category")
	private String category;


	@JsonField(name ="updated")
	private String updated;


	@JsonField(name ="status")
	private String status;

	public void setThumbnail(Thumbnail thumbnail){
		this.thumbnail = thumbnail;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setContent(Content content){
		this.content = content;
	}

	public Content getContent(){
		return content;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setCommentCount(int commentCount){
		this.commentCount = commentCount;
	}

	public int getCommentCount(){
		return commentCount;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setUploaded(String uploaded){
		this.uploaded = uploaded;
	}

	public String getUploaded(){
		return uploaded;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setViewCount(int viewCount){
		this.viewCount = viewCount;
	}

	public int getViewCount(){
		return viewCount;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"thumbnail = '" + thumbnail + '\'' + 
			",rating = '" + rating + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",content = '" + content + '\'' + 
			",tags = '" + tags + '\'' + 
			",commentCount = '" + commentCount + '\'' + 
			",duration = '" + duration + '\'' + 
			",uploaded = '" + uploaded + '\'' + 
			",id = '" + id + '\'' + 
			",viewCount = '" + viewCount + '\'' + 
			",category = '" + category + '\'' + 
			",updated = '" + updated + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
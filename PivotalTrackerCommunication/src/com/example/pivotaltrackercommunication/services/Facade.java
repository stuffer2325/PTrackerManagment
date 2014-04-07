package com.example.pivotaltrackercommunication.services;

public class Facade {
	private static Facade instance;
	public IStoryContainer CurrentStoriesContainer;
	public IStoryContainer BacklogStoriesContainer;
	public IStoryContainer IceboxStoriesContainer;
	
	protected Facade()
	{
	}
	
	public static Facade getInstance()
	{
		if(instance == null)
		{
			instance = new Facade();
		}		
		return instance;
	}
	
	public Story[] getCurrentStories(){
		return CurrentStoriesContainer.getStories();
	}
	
	public Story[] getBacklogStories()
	{
		return BacklogStoriesContainer.getStories();
	}
	
	public Story[] getIceboxStories()
	{
		return IceboxStoriesContainer.getStories();
	}
}

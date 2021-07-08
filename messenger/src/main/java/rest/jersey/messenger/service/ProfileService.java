package rest.jersey.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import rest.jersey.messenger.database.DatabaseClass;
import rest.jersey.messenger.model.Message;
import rest.jersey.messenger.model.Profile;

public class ProfileService {
	
	public ProfileService() {
		
		profiles.put("kacper", new Profile(1L,"kacper","Kacper","Kaccper"));
	}

	private Map<String,Profile>profiles = DatabaseClass.getProfiles();
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addAllProfile(Profile profile){
	
		profile.setId(profiles.size()+1);
		profiles.put(profile.getPrifilename(),profile);
		
		return profile;
		
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getPrifilename().isEmpty()){
			return null;
		}
		profiles.put(profile.getPrifilename(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
	
}

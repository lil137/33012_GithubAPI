import java.io.IOException;

import org.eclipse.egit.github.core.*;
import org.eclipse.egit.github.core.client.*;
import org.eclipse.egit.github.core.service.*;

public class Getdata {

	public static void main(String[] args) throws IOException {

		//Basic authentication		
		GitHubClient client = new GitHubClient();
		//client.setCredentials("lil137", "tckt31079");
		client.setOAuth2Token("bd7f94f8e5038023818180598e2e2dfe8d025691");
		
		RepositoryService service = new RepositoryService();
		for (Repository repo : service.getRepositories("lil137"))
		  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
		
		//for (Repository repo : service.getCommit("google-research"))
		//	  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
		//service.getLanguages("google-reasearch");
		Repository Google_research = new Repository();
		Google_research.setName("google-research");
		for (String repo : service.getLanguages("Google-research"))
			  System.out.println(repo);
	}

	
	
	
}

import java.io.IOException;

import org.eclipse.egit.github.core.*;
import org.eclipse.egit.github.core.client.*;
import org.eclipse.egit.github.core.service.*;

public class Getdata {

	public static void main(String[] args) throws IOException {

		//Basic authentication		
		GitHubClient client = new GitHubClient();
		client.setCredentials("lil137", "tckt31079");
		//client.setOAuth2Token("bd7f94f8e5038023818180598e2e2dfe8d025691");
		CollaboratorService collaboratorservice = new CollaboratorService(client);
		RepositoryId repository = new RepositoryId("google-research","google-research");
		repository = RepositoryId.createFromUrl("https://github.com/google-research/google-research");
		RepositoryService githubservice = new RepositoryService();
		int contributor_count = 0;
		for (Contributor contributor :githubservice.getContributors(repository,false)) {
			contributor_count++;
			System.out.println(contributor.getName());
		}
		System.out.println(contributor_count);
		//for (User user : collaboratorservice.getCollaborators(repository))
		//	  System.out.println(user.getName());
		
		//RepositoryService service = new RepositoryService();
		//for (Repository repo : service.getRepositories("lil137"))
		//  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
		
		//for (Repository repo : service.getCommit("google-research"))
		//	  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
		//service.getLanguages("google-reasearch");
	
		//for (String repo : service.getLanguages("Google-research"))
		//	  System.out.println(repo);
	}

	
	
	
}

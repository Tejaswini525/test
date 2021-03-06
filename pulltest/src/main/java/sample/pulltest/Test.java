package sample.pulltest;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.egit.github.core.PullRequest;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.PullRequestService;
import org.eclipse.egit.github.core.service.RepositoryService;


public class Test {
	
	private GitHubClient gitHubClient = new GitHubClient("github.com");
	private PullRequestService pullRequestService = new PullRequestService(gitHubClient);
	private RepositoryId repo= new RepositoryId("Tejaswini525", "test");
	private RepositoryService repositoryService= new RepositoryService(gitHubClient);
	
	private org.eclipse.egit.github.core.Repository repository;
	
	public static void main(String[] args) throws IOException {
		Test t = new Test();
		String userName = "tejaswini525";
		String passwd = "tejaswini123";
		t.gitHubClient.setCredentials(userName, passwd);
		t.createPullRequest();

	}

	public void createPullRequest() throws IOException { 
		/*
		repository = repositoryService.getRepository(repo);
		// pullRequestService.getCommits(repository, 1); 
		 // GitHubRequest request = new GitHubRequest(); 
		 // request.setUri("/tvasamsetty/rtracker-io/pulls");
		  //request.setUri(new StringBuilder("/repos/tvasamsetty/rtracker-io/pulls/5/commits"));  
		
		  PullRequest request = new PullRequest(); 
		  request.setBody("a fix"); 
		 request.setTitle("this is a fix"); 
		  request.setHead(new PullRequestMarker().setRef("Tejaswini525")); 
		  request.setBase(new PullRequestMarker().setRef("TestPR123")); 
		  pullRequestService.createPullRequest(repo, request); */
		  
		
		
		
		  Map<String, Object> params = new HashMap<String, Object>();
			//params.put("issue", issueId); //$NON-NLS-1$
			params.put("head", "master"); //$NON-NLS-1$
			params.put("base", "master"); //$NON-NLS-1$
			 gitHubClient.post("github.com/Tejaswini525/test/pull", params, PullRequest.class);
		 		 }
}


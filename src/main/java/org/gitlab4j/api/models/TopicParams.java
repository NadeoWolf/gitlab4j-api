package org.gitlab4j.api.models;

import org.gitlab4j.api.GitLabApiForm;

/**
 * This class is utilized by the {@link org.gitlab4j.api.GroupApi#createGroup(TopicParams)}
 * and {@link org.gitlab4j.api.GroupApi#updateGroup(Object, TopicParams)} methods to set
 * the parameters for the call to the GitLab API.
 */
public class TopicParams {

    private String name;
    private String title;
    private String description;
    private String avatar;






    public TopicParams withName(String name) {
	this.name = name;
	return (this);
    }

    public TopicParams withTitle(String title) {
        this.title = title;
        return (this);
    }

    public TopicParams withDescription(String description) {
	this.description = description;
	return (this);
    }

    public TopicParams withAvatar(String avatar) {
        this.avatar = avatar;
        return (this);
    }



    /**
     * Get the form params for a group create oir update call.
     *
     * @param isCreate set to true for a create group call, false for update
     * @return a GitLabApiForm instance holding the parameters for the group create or update operation
     * @throws RuntimeException if required parameters are missing
     */
    public GitLabApiForm getForm(boolean isCreate) {

	GitLabApiForm form = new GitLabApiForm()
	    .withParam("name", name, isCreate)
            .withParam("title", title, isCreate)
            .withParam("description", description)
            .withParam("avatar", avatar);

        return (form);
    }
}

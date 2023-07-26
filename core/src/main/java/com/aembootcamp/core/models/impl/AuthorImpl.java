package com.aembootcamp.core.models.impl;

import com.aembootcamp.core.models.Author;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class, adapters = Author.class, resourceType = "aem-bootcamp/components/general/author")
public class AuthorImpl implements Author {
    @Inject
    @Default(values = "Perficient")
    String firstName;
    @Inject
    @Default(values = "AEM")
    String lastName;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}

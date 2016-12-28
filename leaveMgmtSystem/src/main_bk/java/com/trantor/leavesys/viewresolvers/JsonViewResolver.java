package com.trantor.leavesys.viewresolvers;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class JsonViewResolver implements ViewResolver {

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		// TODO Auto-generated method stub
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);       
        return view;
	}

}

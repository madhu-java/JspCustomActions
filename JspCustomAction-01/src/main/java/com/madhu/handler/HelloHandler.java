package com.madhu.handler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloHandler implements Tag {
	PageContext pageContext;
	String name;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

static {
	System.out.println("Hellohandle.class file is loading...");
}
public HelloHandler() {
	System.out.println("Hellohandle.class file is instantiated...");
}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("Hellohandle. doEndTag() ..");
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("Hellohandle. doStartTag() ..");
		 try {
			JspWriter out = pageContext.getOut();
			out.println("<h1> this is from tag handler class</h1>");
			if(name==null) {
				out.println("<h4>Hello guest...</h4>");
			}else {
				out.println("<h4>Hello : "+name+"</h4>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public Tag getParent() {
		System.out.println("Hellohandle. getParent() ..");
		return null;
	}

	@Override
	public void release() {
		System.out.println("Hellohandle. release() ..");

	}

	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext=pageContext;
		System.out.println("Hellohandle. setPageContext() ..");

	}

	@Override
	public void setParent(Tag arg0) {
		System.out.println("Hellohandle. setParent() ..");

	}

}

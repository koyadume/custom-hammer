package in.mechcloud.piston.apps.hammer.actions;

import in.koyad.piston.app.api.annotation.AnnoPluginAction;
import in.koyad.piston.app.api.model.Request;
import in.koyad.piston.app.api.model.Response;
import in.koyad.piston.app.api.plugin.BasePluginAction;
import in.koyad.piston.common.basic.exception.FrameworkException;

@AnnoPluginAction(
	name = HelloPluginAction.ACTION_NAME
)
public class HelloPluginAction extends BasePluginAction {
	
	public static final String ACTION_NAME = "hello";

	@Override
	public String execute(Request req, Response resp) throws FrameworkException {
		return "/hello.xml";
	}

}

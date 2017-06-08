package in.mechcloud.piston.apps.hammer.plugins;

import in.koyad.piston.app.api.annotation.AnnoPlugin;
import in.koyad.piston.app.api.plugin.BasePlugin;
import in.mechcloud.piston.apps.hammer.actions.HelloPluginAction;

@AnnoPlugin(
		name = "hello", 
		title = "Hello", 
		defaultAction = HelloPluginAction.ACTION_NAME
)
public class HelloPlugin extends BasePlugin {

	@Override
	public void postProcess() {
		// TODO Auto-generated method stub

	}

	@Override
	public void preProcess() {
		// TODO Auto-generated method stub

	}

}

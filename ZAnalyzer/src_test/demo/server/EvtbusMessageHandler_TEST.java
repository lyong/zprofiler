/**
 * 
 */
package demo.server;

import org.zkoss.monitor.message.NewTimelineMessage;
import org.zkoss.monitor.message.StringMessage;
import org.zkoss.monitor.server.EventBusMessageHandler;
import org.zkoss.monitor.server.EventBusMessageHandler.MessageEvent;

/**
 * @author Ian YT Tsai(Zanyking)
 *
 */
public class EvtbusMessageHandler_TEST {


	public static void main(String[] args) throws Exception{
		EventBusMessageHandler handler = new EventBusMessageHandler();
		handler.addMessageEventListener(new EvtListener1());
		handler.addMessageEventListener(new EvtListener2());
		handler.handle(new StringMessage("This is a String!"), true);
		handler.handle(new NewTimelineMessage(), false);
		
	}
	
	
	public static class EvtListener1{
		public void onFxxk(String kk){
			System.out.println(">>> This is not a event Listening method!");
		}
		public void Fxxk(String kk){
			System.out.println(">>> nor this one~");
		}
		
		public void onAddTimeline(MessageEvent<NewTimelineMessage> evt){
			System.out.println(">>> onAddTimeline:: MessageEvent<NewTimelineMessage>");
		}
		
		
		public void onString(MessageEvent<StringMessage> evt){
			System.out.println(">>> onString:: MessageEvent<StringMessage>: "+evt.getMessage());
		}
	}//end of class...
	public static class EvtListener2{
		public void onFxxk(String kk){
			System.out.println(">>> This is not a event Listening method!");
		}
		public void Fxxk(String kk){
			System.out.println(">>> nor this one~");
		}
		
		public void onAddTimeline(MessageEvent<NewTimelineMessage> evt){
			System.out.println(">>> EvtListener2:onAddTimeline:: MessageEvent<NewTimelineMessage>");
		}
		
		
		public void onString(MessageEvent<StringMessage> evt){
			System.out.println(">>> EvtListener2:onString:: MessageEvent<StringMessage>: "+evt.getMessage());
		}
	}//end of class...
}

package shypovskikh.SpringAspectJ.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("someService")
public class SomeService {

	
	public SomeService() {}
	
	public int getIntValue() {
		return 25;
	}
	
	public double getDoubleValue() {
		return 6.9;
	}
}

package observer;

import java.awt.Color;

public interface Subject {
	
	void addListener(Listener listener);
	void deleteListener(Listener listener);
	void notificar(Color color);
	
	
}

package composite;

import org.junit.*;

public class MyTest {
	@Test
	public void test() {
		MessageComposite top = new MessageComposite("Top");
		top.add(new MessageComposite("Top-1"));
		top.add(new MessageComposite("Top-2"));
		
		MessageComposite bottom = new MessageComposite("Bottom");
		bottom.add(new MessageComposite("Bottom-1"));
		bottom.add(new MessageComposite("Bottom-2"));
		
		MessageComposite comp = new MessageComposite("Composites");
		comp.add(bottom);
		comp.add(top);		
		comp.print();
	}	
}

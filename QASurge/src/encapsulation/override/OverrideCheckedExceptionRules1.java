package encapsulation.override;

import java.io.FileNotFoundException;
import java.sql.SQLException;

// The overriding method must NOT throw checked exceptions that are new
// or broader than those declared by the overridden method.

/**
 * Example of Checked Exceptions
 * 
 * ClassNotFoundException, FileNotFoundException, InterruptedException
 * FileNotFoundException, ObjectStreamException, InvalidClassException
 *
 */

class A1 {

	public void testA() throws SQLException {
	}
}

class A2 extends A1 {

	// public void testA() throws FileNotFoundException{ }
}

class A3 extends A1 {

	// public void testA() throws Exception{ }
}

public class OverrideCheckedExceptionRules1 {

}

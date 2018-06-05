package Main;
import java.util.ArrayList;

import Command.*;

public class Main {

	public static void main(String[] argv) {

		Status status = Status.getInstance();

		BaseCommand command = null;

		if (argv.length == 0) {
			System.err.println("옵션을 입력하세요");
			System.exit(1);
		}

		switch (argv[0]) {

		case "init":
			command = new Init(argv[1]);
			break;

		case "add":
			command = new Add(argv[1]);
			break;

		case "commit":
			command = new Commit();
			break;

		case "breanch":
			command = new Branch(argv[1]);
			break;

		case "merge":
			break;

		case "checkout":
			break;

		default:
			break;
		}

		command.execute();
	}
}

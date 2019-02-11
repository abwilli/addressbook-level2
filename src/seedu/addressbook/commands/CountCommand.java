package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user.
 */
public class CountCommand extends Command {

    public static final String COMMAND_WORD = "count";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays count of all contacts in the address book.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        int total = allPersons.size();
        System.out.println("    count: " + total);
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}

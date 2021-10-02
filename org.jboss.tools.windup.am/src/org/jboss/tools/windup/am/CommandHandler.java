package org.jboss.tools.windup.am;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.ls.core.internal.IDelegateCommandHandler;

public class CommandHandler implements IDelegateCommandHandler {

    public static final String GENERATE_DIAGNOSTICS = "am.generateDiagnostics";

    @Override
    public Object executeCommand(String commandId, List<Object> arguments, IProgressMonitor progress) throws Exception {
        switch (commandId) {
            case GENERATE_DIAGNOSTICS:
                return null;
            default:
                break;
        }
        throw new UnsupportedOperationException(String.format("Application Migration plugin doesn't support the command '%s'.", commandId));
    }
}
package behavioral.templatemethod;

public abstract class Task {
    private final AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public void execute() {
        auditTrail.record();
        doExecute();

    }

    protected abstract void doExecute();
}

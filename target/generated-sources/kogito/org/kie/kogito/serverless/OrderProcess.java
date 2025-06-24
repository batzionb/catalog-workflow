package org.kie.kogito.serverless;

import org.kie.kogito.serverless.workflow.models.JsonNodeModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("order")
@io.quarkus.runtime.Startup()
public class OrderProcess extends org.kie.kogito.process.impl.AbstractProcess<org.kie.kogito.serverless.workflow.models.JsonNodeModel> {

    @jakarta.inject.Inject()
    public OrderProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public OrderProcess() {
    }

    @Override()
    public org.kie.kogito.serverless.OrderProcessInstance createInstance(org.kie.kogito.serverless.workflow.models.JsonNodeModel value) {
        return new org.kie.kogito.serverless.OrderProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.kie.kogito.serverless.OrderProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.serverless.workflow.models.JsonNodeModel value) {
        return new org.kie.kogito.serverless.OrderProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.kie.kogito.serverless.OrderProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.kie.kogito.serverless.workflow.models.JsonNodeModel value) {
        return new org.kie.kogito.serverless.OrderProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.kie.kogito.serverless.workflow.models.JsonNodeModel createModel() {
        return new org.kie.kogito.serverless.workflow.models.JsonNodeModel();
    }

    public org.kie.kogito.serverless.OrderProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.kie.kogito.serverless.workflow.models.JsonNodeModel) value);
    }

    public org.kie.kogito.serverless.OrderProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.kie.kogito.serverless.workflow.models.JsonNodeModel) value);
    }

    public org.kie.kogito.serverless.OrderProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kie.kogito.serverless.OrderProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.kie.kogito.serverless.OrderProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.kie.kogito.serverless.OrderProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("order", true);
        factory.variable("workflowdata", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(com.fasterxml.jackson.databind.JsonNode.class), "{}", java.util.Map.of());
        factory.variable("Fetch Entities_5", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(com.fasterxml.jackson.databind.JsonNode.class), java.util.Map.of("customTags", "internal"));
        factory.variable("Count Entities_11", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(com.fasterxml.jackson.databind.JsonNode.class), java.util.Map.of("customTags", "internal"));
        factory.expressionLanguage("jq");
        factory.name("Backstage Catalog");
        factory.packageName("org.kie.kogito.serverless");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("SW");
        factory.visibility("Public");
        factory.metaData("jbpm.enable.multi.con", null);
        factory.metaData("Variable", "workflowdata");
        factory.metaData("Description", "Order Workflow Sample + Entity Counting");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode1 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("1"));
        startNode1.name("Start");
        startNode1.interrupting(false);
        startNode1.metaData("UniqueId", "1");
        startNode1.metaData("EventType", "none");
        startNode1.metaData("state", "Fetch Entities");
        startNode1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("2"));
        endNode2.name("End");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "2");
        endNode2.metaData("state", "Count Entities");
        endNode2.done();
        org.jbpm.ruleflow.core.factory.CompositeContextNodeFactory<?> compositeContextNode3 = factory.compositeContextNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("3"));
        compositeContextNode3.name("Fetch Entities");
        compositeContextNode3.metaData("UniqueId", "3");
        compositeContextNode3.metaData("MetricName", "Fetch Entities");
        compositeContextNode3.metaData("state", "Fetch Entities");
        compositeContextNode3.variable("Fetch Entities_5", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(com.fasterxml.jackson.databind.JsonNode.class), java.util.Map.of("customTags", "internal"));
        compositeContextNode3.autoComplete(true);
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode4 = compositeContextNode3.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("4"));
        startNode4.name("EmbeddedStart");
        startNode4.interrupting(false);
        startNode4.metaData("UniqueId", "4");
        startNode4.metaData("EventType", "none");
        startNode4.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode6 = compositeContextNode3.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("6"));
        workItemNode6.name("getEntities");
        workItemNode6.workName("backstagecatalog_Query catalog entities");
        workItemNode6.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("workflowdata", "workflowdata", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("Parameter", "Parameter", "java.lang.Object", null), null, null));
        workItemNode6.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("Result", "Result", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("Fetch Entities_5", "Fetch Entities_5", "java.lang.Object", null), null, null));
        workItemNode6.done();
        workItemNode6.metaData("UniqueId", "6");
        workItemNode6.metaData("action", "getEntitiesCall");
        workItemNode6.metaData("state", "Fetch Entities");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode7 = compositeContextNode3.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("7"));
        actionNode7.name("Script");
        actionNode7.metaData("UniqueId", "7");
        actionNode7.action(new org.kie.kogito.serverless.workflow.actions.MergeAction("Fetch Entities_5", "workflowdata"));
        actionNode7.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode8 = compositeContextNode3.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("8"));
        endNode8.name("EmbeddedEnd");
        endNode8.terminate(true);
        endNode8.metaData("UniqueId", "8");
        endNode8.done();
        compositeContextNode3.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("4"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("6"), "4_6");
        compositeContextNode3.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("7"), "6_7");
        compositeContextNode3.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("7"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("8"), "7_8");
        compositeContextNode3.done();
        org.jbpm.ruleflow.core.factory.CompositeContextNodeFactory<?> compositeContextNode9 = factory.compositeContextNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("9"));
        compositeContextNode9.name("Count Entities");
        compositeContextNode9.metaData("UniqueId", "9");
        compositeContextNode9.metaData("MetricName", "Count Entities");
        compositeContextNode9.metaData("state", "Count Entities");
        compositeContextNode9.variable("Count Entities_11", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(com.fasterxml.jackson.databind.JsonNode.class), java.util.Map.of("customTags", "internal"));
        compositeContextNode9.autoComplete(true);
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode10 = compositeContextNode9.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("10"));
        startNode10.name("EmbeddedStart");
        startNode10.interrupting(false);
        startNode10.metaData("UniqueId", "10");
        startNode10.metaData("EventType", "none");
        startNode10.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode12 = compositeContextNode9.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("12"));
        actionNode12.name("printMessage");
        actionNode12.metaData("UniqueId", "12");
        actionNode12.metaData("action", "storeCount");
        actionNode12.metaData("state", "Count Entities");
        actionNode12.action(new org.kie.kogito.serverless.workflow.actions.SysoutAction("jq", "\"Entity count is \" + .length", "workflowdata", org.kie.kogito.serverless.workflow.actions.WorkflowLogLevel.INFO, true));
        actionNode12.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode13 = compositeContextNode9.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("13"));
        actionNode13.name("Script");
        actionNode13.metaData("UniqueId", "13");
        actionNode13.action(new org.kie.kogito.serverless.workflow.actions.ExpressionAction("jq", "{ entityCount: .length }", "Count Entities_11", "Count Entities_11"));
        actionNode13.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode14 = compositeContextNode9.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("14"));
        actionNode14.name("Script");
        actionNode14.metaData("UniqueId", "14");
        actionNode14.action(new org.kie.kogito.serverless.workflow.actions.MergeAction("Count Entities_11", "workflowdata"));
        actionNode14.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode15 = compositeContextNode9.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("15"));
        endNode15.name("EmbeddedEnd");
        endNode15.terminate(true);
        endNode15.metaData("UniqueId", "15");
        endNode15.done();
        compositeContextNode9.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("10"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("12"), "10_12");
        compositeContextNode9.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("12"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("13"), "12_13");
        compositeContextNode9.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("13"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("14"), "13_14");
        compositeContextNode9.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("14"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("15"), "14_15");
        compositeContextNode9.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("9"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("2"), "9_2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("1"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("3"), "1_3");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("3"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("9"), "3_9");
        factory.validate();
        return factory.getProcess();
    }
}

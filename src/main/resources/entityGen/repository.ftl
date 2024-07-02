package ${packageName};

<#list importRules as rule>
import ${rule.importValue};
</#list>

public interface ${className} <#if interfaceNames.size() \gt 0>extends ${interfaceNames?join(", ")} </#if>{
}
import hudson.model.*
import hudson.node_monitors.*
import hudson.slaves.*
import java.util.concurrent.*
import hudson.tools.ToolDescriptor;
import hudson.tools.ToolInstallation;
jenkins = Hudson.instance
   
TaskListener log;

 for (ToolDescriptor<?> desc : ToolInstallation.all()) {
            for (ToolInstallation inst : desc.getInstallations()) {
                println ('\tTool Name: ' + inst.getName());
                
            }  
 }
   

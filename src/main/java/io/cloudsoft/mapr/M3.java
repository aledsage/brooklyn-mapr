package io.cloudsoft.mapr;

import java.util.List;

import brooklyn.entity.Entity;
import brooklyn.entity.proxying.ImplementedBy;
import brooklyn.entity.trait.Startable;
import brooklyn.event.basic.BasicConfigKey;

@ImplementedBy(M3Impl.class)
public interface M3 extends Entity, Startable {

   public static BasicConfigKey<String> MASTER_HOSTNAME = new BasicConfigKey<String>(
           String.class, "mapr.master.hostname", "");

   /**
    * hostnames of all machines expected to run zookeeper
    */
   public static BasicConfigKey<List<String>> ZOOKEEPER_HOSTNAMES = new BasicConfigKey(
           List.class, "mapr.zk.hostnames", "");
   /**
    * configuration is set when all expected zookeepers have started the zookeeper process
    */
   public static BasicConfigKey<List<Boolean>> ZOOKEEPER_READY = new BasicConfigKey(
           List.class, "mapr.zk.ready", "");

   /**
    * configuration is set when the master node has come up (license approved etc)
    */
   public static BasicConfigKey<Boolean> MASTER_UP = new BasicConfigKey<Boolean>(
           Boolean.class, "mapr.master.serviceUp", "");
}

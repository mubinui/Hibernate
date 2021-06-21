[Hibernate]
 -> Java Objects -> Hibernate -> JDBC (Underneath)-> DBMS


[Hibernate Configuration ]

<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd"><hibernate-configuration>
    <session-factory>
        <property name="connection.driver_class">org.postgresql.Driver</property>
        <property name="connection.url">jdbc:postgresql://localhost:5432/myhibernate</property>
        <property name="connection.username">postgres</property>
        <property name="connection.password">root</property>
        <property name="dialect">org.hibernate.dialect.PostgreSQL9Dialect</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
    </session-factory>
</hibernate-configuration>

[Session Factory]
 -> Works for giving session
 -> For one project one session
 -> Used for saving objects etc



 [Class Variable mapping ]
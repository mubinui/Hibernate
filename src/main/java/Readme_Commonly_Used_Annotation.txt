Commonly used Annotations of Hibernate
    -> For making table => @Entity(name="The name you want ")
    -> For changing the information in the table we use => @Table()
    -> @Id for marking primary key (The column we want to use as primary key)
    -> => @GeneratedValue automatic generate value according internal sequence
    -> => @Column Modifying / specifying  the column details -> nullable , name changing ,changing properties
    -> => @Transient Exclude column from the database table
    -> => @Temporal for formatting a date
    -> => @Lob signifies large object data type Blob/Clob


Other important annotations are
    -> @OneToMany
    -> @JoinColumn
    -> @OneToOne

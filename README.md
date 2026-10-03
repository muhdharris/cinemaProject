# Cinema Booking System

A desktop cinema management application in Java: browse what's showing, book seats,
and let staff manage the catalogue.

Built as a coursework project for Computer Systems & Networks.

## What it does

**Customer side**
- Browse films currently showing
- Book seats for a screening

**Staff side**
- Add, edit and delete films
- Manage screenings and print schedules

## Stack

- **Java** with Swing for the interface
- **MySQL** for persistence, connected through `MysqlDataSource`
- NetBeans project layout (`build.xml`, `nbproject/`) — open it in NetBeans

## Files worth reading first

| File | Purpose |
|---|---|
| `Main.java` | Entry point |
| `NowShowing.java` / `.form` | Customer-facing listing and browsing |
| `FNB_Customer.java` | Customer booking flow |
| `FNB_Staff.java` | Staff-side operations |
| `MovieEdit.java` / `.form` | Catalogue editing |
| `MyConnection.java` | Database connection |

## Running it

Needs a MySQL instance with the schema created first — `MyConnection.java` expects a
running server and a configured database. The connection details are currently inline
in that file rather than read from configuration, which is the first thing to change
if this were picked up again.

Open the project in NetBeans and run `Main`.

## Licence

MIT — see [LICENSE](LICENSE).

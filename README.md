# README (3-Screen Format)
# 🟦 Screen 1 — Hero (3-Second Understanding)

# SQL-SI

## SQL as a Structural Intelligence Backend

> Transform SQL from a query engine into a **CCC / Trajectory / Metric / PDS–enabled intelligence system**

    SQL-SI = SQL + Structural Objects + Metric Space + CCC + PDS
    
## Core Idea
- SQL already implements K + D (Knowledge + Decision)
- Missing layers:
    - CCC (structural invariants)
    - Trajectory (temporal structure)
    - Metric space (distance)
    _ PDS (policy decision)

👉 SQL-SI fills this gap.

## Architecture

    [ PDS / Policy Layer ]
    [ CCC Engine ]
    [ Trajectory / Graph Layer ]
    [ SQL Relational Layer ]
    [ Raw Data ]
    
## Why It Matters
- Moves AI from **probabilistic narrative → verifiable structure**
- Enables **reusable structural memory**
- Bridges **database systems ↔ structural intelligence**

---

# 🟨 Screen 2 — Deep Theory / Architecture

## 1. SQL as Intelligence System    

    S(u) → K(SQL) → D(Query Planner)

SQL is already:

- Declarative reasoning
- Constraint-based inference
- Deterministic execution

## 2. The Core Limitation

SQL lacks:

    CCC
    Trajectory
    Graph
    Metric Distance
    Policy

Thus:

    Every structure must be recomputed → no reuse → no evolution
    
## 3. Structural Object Layer (Key Upgrade)

SQL-SI introduces:

    CCCObject
    TrajectoryObject
    GraphObject
    PolicyObject
    EvidenceObject
    
## 4. Metric Space Integration

    MetricPoint = any object with computable distance

Examples:

- CCCPoint
- TrajectoryPoint
- GraphPoint

## 5. New Query Semantics (Conceptual)

    SELECT * FROM ccc_objects
    WHERE METRIC_DISTANCE(ccc, :target) < 0.1;
    
    SELECT * FROM trajectories
    INFER REGIME_SHIFT;
    
    SELECT * FROM candidates
    DECIDE USING policy_safe;
    
## 6. Core Insight

> SQL becomes Phase-1 substrate
> CCC / Metric / PDS become Phase-2 intelligence  

# 🟩 Screen 3 — Engineering / Runtime / Demo

## Minimal Pipeline
    SQL rows
    → Trajectory extraction
    → Graph construction
    → CCC discovery
    → Metric embedding
    → Storage
    → Reuse
    
## Modules
    com.dbm.sqlsi.object
    com.dbm.sqlsi.metric
    com.dbm.sqlsi.ccc
    com.dbm.sqlsi.trajectory
    com.dbm.sqlsi.runtime  
    
## Demo Capabilities (v0.1)

- Extract trajectory from events
- Compute metric distance
- Discover simple CCC
- Reuse CCC in query

## Example Flow

    events → trajectory → CCC → store → query by distance    
    
---

## Experimental / Validation Section

SQL-SI v0.1 includes three minimal validation paths:

### 1. Runtime Trace

Raw SQL-style rows are transformed into:

- Trajectory objects
- CCC objects
- Persistent structural store entries

Run:

```bash
mvn test

Or:

mvn exec:java -Dexec.mainClass="com.dbm.sqlsi.demo.SqlSiMarkdownTraceDemo"
```

### 2. SQL vs SQL-SI Comparative Demo

Traditional SQL-like execution recomputes average patterns at query time.

SQL-SI instead extracts and stores:

- trajectories
- CCC signatures
- stability scores

Run:

    mvn exec:java -Dexec.mainClass="com.dbm.sqlsi.demo.SqlVsSqlSiComparativeDemo"

### 3. Core Validation Claim

Traditional SQL:

    rows → query → recomputed result

SQL-SI:

    rows → trajectory → CCC → store → reuse

This demonstrates the core SQL-SI transition:

> from query-time recomputation to persistent structural intelligence.



---

## 7. Recommended Commit Layout

    docs/
      FIGURE-INDEX.md
      figures/
        fig-001-sql-si-layered-architecture.svg
        fig-002-sql-to-sqlsi-flow.svg
        fig-003-sql-vs-sqlsi-runtime.svg
    
    src/main/java/com/dbm/sqlsi/
      metric/
      trajectory/
      ccc/
      store/
      runtime/
      trace/
      comparative/
      demo/
    
    src/test/java/com/dbm/sqlsi/
      trace/
      comparative/

## 8. This Pack’s Position

This pack gives SQL-SI its first concrete runtime proof:

    SQL rows
    → TrajectoryObject
    → CccObject
    → StructuralObjectStore
    → Markdown Trace
    → Comparative Report

核心结论可以放进 README Hero：

> SQL-SI converts SQL from a recomputation-oriented query system into a reusable structural intelligence backend.
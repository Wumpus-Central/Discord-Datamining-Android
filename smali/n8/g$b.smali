.class public final Ln8/g$b;
.super Ln8/g$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final v:Z

.field public final w:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ln8/g$d;JIJLj7/l;Ljava/lang/String;Ljava/lang/String;JJZZZ)V
    .locals 17

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    move-wide/from16 v6, p6

    .line 14
    .line 15
    move-object/from16 v8, p8

    .line 16
    .line 17
    move-object/from16 v9, p9

    .line 18
    .line 19
    move-object/from16 v10, p10

    .line 20
    .line 21
    move-wide/from16 v11, p11

    .line 22
    .line 23
    move-wide/from16 v13, p13

    .line 24
    .line 25
    move/from16 v15, p15

    .line 26
    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    invoke-direct/range {v0 .. v16}, Ln8/g$e;-><init>(Ljava/lang/String;Ln8/g$d;JIJLj7/l;Ljava/lang/String;Ljava/lang/String;JJZLn8/g$a;)V

    .line 30
    .line 31
    .line 32
    move/from16 v1, p16

    .line 33
    .line 34
    iput-boolean v1, v0, Ln8/g$b;->v:Z

    .line 35
    .line 36
    move/from16 v1, p17

    .line 37
    .line 38
    iput-boolean v1, v0, Ln8/g$b;->w:Z

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method


# virtual methods
.method public b(JI)Ln8/g$b;
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move/from16 v6, p3

    new-instance v19, Ln8/g$b;

    move-object/from16 v1, v19

    iget-object v2, v0, Ln8/g$e;->k:Ljava/lang/String;

    iget-object v3, v0, Ln8/g$e;->l:Ln8/g$d;

    iget-wide v4, v0, Ln8/g$e;->m:J

    iget-object v9, v0, Ln8/g$e;->p:Lj7/l;

    iget-object v10, v0, Ln8/g$e;->q:Ljava/lang/String;

    iget-object v11, v0, Ln8/g$e;->r:Ljava/lang/String;

    iget-wide v12, v0, Ln8/g$e;->s:J

    iget-wide v14, v0, Ln8/g$e;->t:J

    move-object/from16 p1, v1

    iget-boolean v1, v0, Ln8/g$e;->u:Z

    move/from16 v16, v1

    iget-boolean v1, v0, Ln8/g$b;->v:Z

    move/from16 v17, v1

    iget-boolean v1, v0, Ln8/g$b;->w:Z

    move/from16 v18, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v18}, Ln8/g$b;-><init>(Ljava/lang/String;Ln8/g$d;JIJLj7/l;Ljava/lang/String;Ljava/lang/String;JJZZZ)V

    return-object v19
.end method

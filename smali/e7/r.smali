.class public final synthetic Le7/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:Lh8/n;

.field public final synthetic c:Lh8/q;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;Lh8/n;Lh8/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/r;->a:Le7/e1$a;

    iput-object p2, p0, Le7/r;->b:Lh8/n;

    iput-object p3, p0, Le7/r;->c:Lh8/q;

    iput-object p4, p0, Le7/r;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Le7/r;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Le7/r;->a:Le7/e1$a;

    iget-object v1, p0, Le7/r;->b:Lh8/n;

    iget-object v2, p0, Le7/r;->c:Lh8/q;

    iget-object v3, p0, Le7/r;->d:Ljava/io/IOException;

    iget-boolean v4, p0, Le7/r;->e:Z

    move-object v5, p1

    check-cast v5, Le7/e1;

    invoke-static/range {v0 .. v5}, Le7/d1;->j0(Le7/e1$a;Lh8/n;Lh8/q;Ljava/io/IOException;ZLe7/e1;)V

    return-void
.end method

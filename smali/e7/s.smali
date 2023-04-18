.class public final synthetic Le7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/s;->a:Le7/e1$a;

    iput-boolean p2, p0, Le7/s;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Le7/s;->a:Le7/e1$a;

    iget-boolean v1, p0, Le7/s;->b:Z

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, p1}, Le7/d1;->Z(Le7/e1$a;ZLe7/e1;)V

    return-void
.end method

.class public final synthetic Le7/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:Lh8/q;


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;Lh8/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/g0;->a:Le7/e1$a;

    iput-object p2, p0, Le7/g0;->b:Lh8/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Le7/g0;->a:Le7/e1$a;

    iget-object v1, p0, Le7/g0;->b:Lh8/q;

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, p1}, Le7/d1;->m0(Le7/e1$a;Lh8/q;Le7/e1;)V

    return-void
.end method

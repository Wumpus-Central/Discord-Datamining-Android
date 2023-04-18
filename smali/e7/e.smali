.class public final synthetic Le7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/e;->a:Le7/e1$a;

    iput p2, p0, Le7/e;->b:I

    iput-wide p3, p0, Le7/e;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Le7/e;->a:Le7/e1$a;

    iget v1, p0, Le7/e;->b:I

    iget-wide v2, p0, Le7/e;->c:J

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, v2, v3, p1}, Le7/d1;->d0(Le7/e1$a;IJLe7/e1;)V

    return-void
.end method

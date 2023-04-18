.class public final synthetic Le7/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/x0;->a:Le7/e1$a;

    iput p2, p0, Le7/x0;->b:I

    iput-wide p3, p0, Le7/x0;->c:J

    iput-wide p5, p0, Le7/x0;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Le7/x0;->a:Le7/e1$a;

    iget v1, p0, Le7/x0;->b:I

    iget-wide v2, p0, Le7/x0;->c:J

    iget-wide v4, p0, Le7/x0;->d:J

    move-object v6, p1

    check-cast v6, Le7/e1;

    invoke-static/range {v0 .. v6}, Le7/d1;->E0(Le7/e1$a;IJJLe7/e1;)V

    return-void
.end method

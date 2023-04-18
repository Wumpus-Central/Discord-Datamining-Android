.class public final synthetic Lz6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/m0$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lq6/o;


# direct methods
.method public synthetic constructor <init>(JLq6/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lz6/n;->a:J

    iput-object p3, p0, Lz6/n;->b:Lq6/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lz6/n;->a:J

    iget-object v2, p0, Lz6/n;->b:Lq6/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lz6/m0;->x(JLq6/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

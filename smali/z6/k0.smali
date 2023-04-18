.class public final synthetic Lz6/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/m0$b;


# instance fields
.field public final synthetic a:Lz6/m0;

.field public final synthetic b:Lq6/o;


# direct methods
.method public synthetic constructor <init>(Lz6/m0;Lq6/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/k0;->a:Lz6/m0;

    iput-object p2, p0, Lz6/k0;->b:Lq6/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz6/k0;->a:Lz6/m0;

    iget-object v1, p0, Lz6/k0;->b:Lq6/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lz6/m0;->T(Lz6/m0;Lq6/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
